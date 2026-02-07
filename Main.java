import java.util.Scanner;
public class Main{
  public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        //input building type
        String type=sc.nextLine();
        //input amount insured
      float amt=sc.nextFloat();
      //input previous claims
      int cl=sc.nextInt();

      if(type.contains("Domestic") || type.contains("Private House")){
          int pr=50;
          if(amt<100000){
              amt= (float)((0.3*amt)/100);
              amt+=pr;
              if(cl==0){
                  amt=amt-(amt*10/100);
              }System.out.println(amt);
          }else{
              amt=(float)((0.25*amt)/100);
              amt+=pr;
              if(cl==0){
                  amt=amt-(amt*10/100);
              }System.out.println(amt);

          }

      }if(type.contains("Commercial Premise")){
          int pr=80;
          if(amt<250000){
              amt=(float)((0.5*amt)/100);
              amt+=pr;
              if(cl==0){
                amt=amt-(amt*15/100);
              }
              System.out.println(amt);
          }else{
              amt=(float)((0.75*amt)/100);
              amt+=pr;
              if(cl==0){
                  amt=amt-(amt*15/100);
              }
              System.out.println(amt);

          }
      }


    }
}