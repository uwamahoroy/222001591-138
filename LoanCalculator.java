public class LoanCalculator {
    private double principal;
    private double rate;
    private int time;
    public LoanCalculator (double principal, double rate, int time){
        this.principal = principal;
        this.rate = rate / 100;
        this.time = time;
    }
        public double calculateCompoundInterest(){
            double amount = principal * Math.pow(1 + rate / 12, time * 12);
            return amount - principal;
        }
        public static void main(String[]args){
            double loanAmount = 500000;
            double annualInterestRate = 18;
            int years =3;
        LoanCalculator calculator = new LoanCalculator(loanAmount, annualInterestRate, years);
        double CompoundInterest = calculator.calculateCompoundInterest();
        double totalpaid = loanAmount + CompoundInterest;
        System.out.println("Total amount paid with compound interest after 3 years: RWF" + totalpaid);
    }
}
