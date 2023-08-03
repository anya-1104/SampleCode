package firstcode;

class main {
    public static void main(String[] args) {
        int[] foo = {0, 1, 2, 3, 4};

        int[] par = new int[100];
        for(int i = 0; i < 100; i++){
            par[i] = i;
        }
        System.out.println("The number of even numbers in foo is:");
        System.out.println(countEvenNum(foo, 5));

        System.out.println("The number of even numbers in par is:");
        System.out.println(countEvenNum(par, 100));

    }



    private static int countEvenNum(int[] arr, int size){
        int count = 0;

        for(int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
            else{

            }
        }

        return count;
    }
}