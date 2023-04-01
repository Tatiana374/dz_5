public class Main {
    public static void main(String[] args) {
/* Надає значення 4 полям типу int.*/
       int a =1;
       int b =2;
       int c =3;
       int d = 4;
/* Сумує їх попарно*/

       int sum1 = a +b;
       int sum2 = c +d;
/*Виводить результат порівняння сум (true, якщо перша сума більша).*/

        System.out.println(sum1 > sum2);
/* Збільшує першу суму на 1*/


        int plus = ++sum1;
        System.out.println(plus);
      /* або написати просто так  System.out.println(sum1++);*/
        /*Другу суму зменшує на 2*/
        --sum2;
        int minus = --sum2;
        System.out.println(minus);

     /*Виводить результат порівняння (true якщо перша сума більша).*/

        System.out.println(plus >= minus);

/*Виводить true якщо хоча б одна сума кратна 2, інакше - false*/


          int check1 = sum1%2;
          int check2 =sum2%2;
          boolean result =(check1 ==1);
          boolean result2 =(check2 ==1);

         String IsFalse = result ^ result2 ? "true" : "false";
        System.out.println(IsFalse);




    }
}