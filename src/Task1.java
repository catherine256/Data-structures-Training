public class Task1 {
    public static void main(String[] args) {
        // the sum variable keeps track of the sum of the Numbers at each iteration
//        initial time is the start time of the entire program while the finalExecutionTime is the end time for
//        the program
        double sum=0, initialTime, startTime, endTime, finalExecutionTime;
        initialTime = System.currentTimeMillis();
        //i holds the number of iterations and N the limit
        int i, N = 1000000000;
        System.out.println("i \t Sum \t Start \t End \t Execution Time");
        for (i=0; i<=3; i++){
            //getting the start time foreach i
            startTime = System.currentTimeMillis();
            //getting the sum
            sum = (i*(i+1))/2;
            //getting the end time foreach i
            endTime = System.currentTimeMillis();
            //getting the execution foreach i
            double executionTime = endTime-startTime;
            System.out.printf("%d \t %2f \t %f \t %f \t %f\n",i,sum,startTime, endTime, executionTime);
        }
        finalExecutionTime = System.currentTimeMillis();
        double totalTime = finalExecutionTime-initialTime;
        System.out.printf("Total Execution Time = %f"   , totalTime);

    }
}
