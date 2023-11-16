package fiscal.tax.controller;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.Cookie;
import fiscal.tax.model.TaxReport;

public class   Controller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            int fiscalID = Integer.parseInt(request.getParameter("idFiscal"));
            String fiscalYear = request.getParameter("fiscalYear");
            TaxReport taxReport = new TaxReport();
            taxReport.setFiscalID(fiscalID);
            taxReport.setFiscalYear(fiscalYear);
            request.setAttribute("taxReport", taxReport);
            String Page;
            if (fiscalID < 10000) {
                Page = "/jsp/regular.jsp";
            } else {
                Page = "/jsp/high.jsp";
            }

            int visitCount = 1;
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if ("visitCount".equals(cookie.getName())) {
                        visitCount = Integer.parseInt(cookie.getValue());
                        visitCount++;
                        cookie.setValue(visitCount+"");
                        response.addCookie(cookie);
                        break;
                    }
                }
            }
            Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));
            visitCookie.setMaxAge(365 * 24 * 60 * 60);
            response.addCookie(visitCookie);

            RequestDispatcher dispatcher =  getServletContext().getRequestDispatcher(Page);
            dispatcher.forward(request, response);
    }
}
