package fiscal.tax.model;
public class TaxReport {
    private int fiscalID;
    private String fiscalYear;
    private Double TaxAmount;

    public int getFiscalID() {
        return fiscalID;}
    public void setFiscalID(int fiscalID2) {
        this.fiscalID = fiscalID2;}
    public String getFiscalYear() {
        return fiscalYear;}
    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;}
    public Double getTaxAmount() {
        return TaxAmount;}
    public void setTaxAmount(Double TaxAmount2) {
        this.TaxAmount = TaxAmount2;}
}

