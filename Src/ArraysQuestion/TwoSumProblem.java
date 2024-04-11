package Src.ArraysQuestion;

class TwoSumProblem {
    void twoSumProblem(int[] ansArr,int target){
        // code
        System.out.println("Two sum problem");
        for (int i = 0; i <ansArr.length-1 ; i++) {
            for (int j = 0; j <ansArr.length-1 ; j++) {
                if (ansArr[i]+ansArr[j] == target){
                    System.out.println(ansArr[i]+" + "+ansArr[j]+" = "+ target);
                }
            }
        }
    }
}
