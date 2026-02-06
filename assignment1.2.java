class PrimeCheck {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a number as command line argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(n + " is a Prime number");
        else
            System.out.println(n + " is not a Prime number");
    }
}
