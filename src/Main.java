//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int[][] matrix = new int[10][10];
    int number, sum1 = 0, sum2 = 0 , n1;
    int index = 9, j;


    for (int i = 0; i < 10; i++) {

        for (j = 0; j < 10; j++) {
            matrix[i][j] = 0;
            number = (int)(Math.random() * 10);
            if ( i == j){
               matrix[i][j] = number;
               sum1 += number;
            }
        }
        n1 = (int)(Math.random() * 10);
        if( i != j){
            matrix[i][index] = n1;
            sum2 += n1;
            System.out.println(sum2);
        }
        j++;
        index--;

    }

    for (int i = 0; i < 10; i++) {
        for (j = 0; j < 10; j++) {
            System.out.print("| " + matrix[i][j] + " ");

            if (j == 9){
                System.out.print("|");
            }
        }
        System.out.println();
    }

    System.out.println(sum2);
    System.out.println(sum1);
    System.out.println("The sum is : " + (sum1 + sum2));
}
