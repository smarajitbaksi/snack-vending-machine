import java.util.*;
class spcl_prog
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int amt,note100,note50,note20,note10,chge;
        int ch,ch1,ch2,ch3,ch4;
        System.out.println("######### SNACK VENDING MACHINE ##########");
        System.out.println("This Vending machine accepts money from Rs.10 to Rs.500");
        System.out.println("SNACKS AVAILABLE ARE:-");
        System.out.println("1.CHIPS");
        System.out.println("2.CHOCOLATES");
        System.out.println("3.PEANUTS");
        System.out.println("4.BEVERAGES");
        System.out.println("PRESS 1 FOR CHIPS");
        System.out.println("PRESS 2 FOR CHOCOLATES");
        System.out.println("PRESS 3 FOR PEANUTS");
        System.out.println("PRESS 4 FOR BEVERAGES");
        System.out.println("ENTER YOUR CHOICE:");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("CHOOSE YOUR REQUIRED CHIPS-");
            System.out.println("PRESS 1 FOR KURKURE @ RS.20");
            System.out.println("PRESS 2 FOR LAY'S @ RS 30");
            System.out.println("PRESS 3 FOR CORNITOS @ RS 80");
            System.out.println("PRESS 4 FOR PRINGLES @ RS 100");
            System.out.println("ENTER THE AMOUNT :");
            amt=sc.nextInt();
            if (amt<10 || amt>500)
            {
                amt=0;
                System.out.println("ENTER MONEY BETWEEN Rs.10- Rs.500");
                amt=sc.nextInt();
            }
            System.out.println("ENTER YOUR CHOICE:");
            ch1=sc.nextInt();
            switch(ch1)
            {
                case 1:
                System.out.println("YOUR CHOICE IS KURKURE");
                if(amt<20)
                {
                    amt=0;
                    System.out.println("INSUFFICIENT AMOUNT.PLEASE ENTER AMOUNT ACCORDINGLY.");
                    amt=sc.nextInt();
                }
                
                chge=amt-20;
                System.out.println("YOUR CHANGE = "+chge+" CAN BE GIVEN AS:");
                note100=chge/100;
                chge=chge%100;
                note50=chge/50;
                chge=chge%50;
                note20=chge/20;
                chge=chge%20;
                note10=chge/10;
                if(note100>0)
                System.out.println("RS.100 NOTE = "+note100);
                if(note50>0)
                System.out.println("RS.50 NOTE = "+note50);
                if(note20>0)
                System.out.println("RS.20 NOTE = "+note20);
                if(note10>0)
                System.out.println("RS.10 NOTE = "+note10);               
                System.out.println("THANK YOU FOR USING SNACK VENDING MACHINE");
                break;
                case 2:
                System.out.println("YOUR CHOICE IS LAY'S");
                if(amt<30)
                {
                    amt=0;
                    System.out.println("INSUFFICIENT AMOUNT.PLEASE ENTER AMOUNT ACCORDINGLY.");
                    amt=sc.nextInt();
                }
                chge=amt-30;
                System.out.println("YOUR CHANGE = "+chge+" CAN BE GIVEN AS:");
                note100=chge/100;
                chge=chge%100;
                note50=chge/50;
                chge=chge%50;
                note20=chge/20;
                chge=chge%20;
                note10=chge/10;
                if(note100>0)
                System.out.println("RS.100 NOTE = "+note100);
                if(note50>0)
                System.out.println("RS.50 NOTE = "+note50);
                if(note20>0)
                System.out.println("RS.20 NOTE = "+note20);
                if(note10>0)
                System.out.println("RS.10 NOTE = "+note10);
                System.out.println("THANK YOU FOR USING SNACK VENDING MACHINE");
                break;
                case 3:
                System.out.println("YOUR CHOICE IS CORNITOS");
                if(amt<80)
                {
                    amt=0;
                    System.out.println("INSUFFICIENT AMOUNT.PLEASE ENTER AMOUNT ACCORDINGLY.");
                    amt=sc.nextInt();
                }
                chge=amt-80;
                System.out.println("YOUR CHANGE = "+chge+" CAN BE GIVEN AS:");
                note100=chge/100;
                chge=chge%100;
                note50=chge/50;
                chge=chge%50;
                note20=chge/20;
                chge=chge%20;
                note10=chge/10;
                if(note100>0)
                System.out.println("RS.100 NOTE = "+note100);
                if(note50>0)
                System.out.println("RS.50 NOTE = "+note50);
                if(note20>0)
                System.out.println("RS.20 NOTE = "+note20);
                if(note10>0)
                System.out.println("RS.10 NOTE = "+note10);
                System.out.println("THANK YOU FOR USING SNACK VENDING MACHINE");
                break;
                case 4:
                System.out.println("YOUR CHOICE IS PRINGLES");
                if(amt<100)
                {
                    amt=0;
                    System.out.println("INSUFFICIENT AMOUNT.PLEASE ENTER AMOUNT ACCORDINGLY.");
                    amt=sc.nextInt();
                }
                chge=amt-100;
                System.out.println("YOUR CHANGE = "+chge+" CAN BE GIVEN AS:");
                note100=chge/100;
                chge=chge%100;
                note50=chge/50;
                chge=chge%50;
                note20=chge/20;
                chge=chge%20;
                note10=chge/10;
                if(note100>0)
                System.out.println("RS.100 NOTE= "+note100);
                if(note50>0)
                System.out.println("RS.50 NOTE= "+note50);
                if(note20>0)
                System.out.println("RS.20 NOTE= "+note20);
                if(note10>0)
                System.out.println("RS.10 note= "+note10);
                System.out.println("THANK YOU FOR USING SNACK VENDING MACHINE");
                break;
                default:
                System.out.println("WRONG CHOICE.");
            }
            break;
            case 2:
            System.out.println("CHOOSE YOUR REQUIRED CHOCOLATE-");
            System.out.println("PRESS 1 FOR SNICKERS @ RS.60");
            System.out.println("PRESS 2 FOR CADBURY DAIRY MILK SILK @ RS 120");
            System.out.println("PRESS 3 FOR TOBLERONE @ RS 200");
            System.out.println("PRESS 4 FOR FERRERO ROCHER @ RS 250");
            System.out.println("ENTER THE AMOUNT :");
            amt=sc.nextInt();
            if (amt<10 || amt>500)
            {
                amt=0;
                System.out.println("ENTER MONEY BETWEEN Rs.10- Rs.500");
                amt=sc.nextInt();
            }
            System.out.println("ENTER YOUR CHOICE:");
            ch2=sc.nextInt();
            switch(ch2)
            {
                case 1:
                System.out.println("YOUR CHOICE IS SNICKERS");
                if(amt<60)
                {
                    amt=0;
                    System.out.println("INSUFFICIENT AMOUNT.PLEASE ENTER AMOUNT ACCORDINGLY.");
                    amt=sc.nextInt();
                }
                
                chge=amt-60;
                System.out.println("YOUR CHANGE = "+chge+" CAN BE GIVEN AS:");
                note100=chge/100;
                chge=chge%100;
                note50=chge/50;
                chge=chge%50;
                note20=chge/20;
                chge=chge%20;
                note10=chge/10;
                if(note100>0)
                System.out.println("RS.100 NOTE = "+note100);
                if(note50>0)
                System.out.println("RS.50 NOTE = "+note50);
                if(note20>0)
                System.out.println("RS.20 NOTE = "+note20);
                if(note10>0)
                System.out.println("RS.10 NOTE = "+note10);
                System.out.println("THANK YOU FOR USING SNACK VENDING MACHINE");
                break;
                case 2:
                System.out.println("YOUR CHOICE IS CADBURY DAIRY MILK SILK");
                if(amt<120)
                {
                    amt=0;
                    System.out.println("INSUFFICIENT AMOUNT.PLEASE ENTER AMOUNT ACCORDINGLY.");
                    amt=sc.nextInt();
                }
                
                chge=amt-120;
                System.out.println("YOUR CHANGE = "+chge+" CAN BE GIVEN AS:");
                note100=chge/100;
                chge=chge%100;
                note50=chge/50;
                chge=chge%50;
                note20=chge/20;
                chge=chge%20;
                note10=chge/10;
                if(note100>0)
                System.out.println("RS.100 NOTE = "+note100);
                if(note50>0)
                System.out.println("RS.50 NOTE = "+note50);
                if(note20>0)
                System.out.println("RS.20 NOTE = "+note20);
                if(note10>0)
                System.out.println("RS.10 NOTE = "+note10);
                System.out.println("THANK YOU FOR USING SNACK VENDING MACHINE");
                break;
                case 3:
                System.out.println("YOUR CHOICE IS TOBLERONE");
                if(amt<200)
                {
                    amt=0;
                    System.out.println("INSUFFICIENT AMOUNT.PLEASE ENTER AMOUNT ACCORDINGLY.");
                    amt=sc.nextInt();
                }
                chge=amt-200;
                System.out.println("YOUR CHANGE = "+chge+" CAN BE GIVEN AS:");
                note100=chge/100;
                chge=chge%100;
                note50=chge/50;
                chge=chge%50;
                note20=chge/20;
                chge=chge%20;
                note10=chge/10;
                if(note100>0)
                System.out.println("RS.100 NOTE = "+note100);
                if(note50>0)
                System.out.println("RS.50 NOTE = "+note50);
                if(note20>0)
                System.out.println("RS.20 NOTE = "+note20);
                if(note10>0)
                System.out.println("RS.10 NOTE = " +note10);
                System.out.println("THANK YOU FOR USING SNACK VENDING MACHINE");
                break;
                case 4:
                System.out.println("YOUR CHOICE IS FERRERO ROCHER");
                if(amt<250)
                {
                    amt=0;
                    System.out.println("INSUFFICIENT AMOUNT.PLEASE ENTER AMOUNT ACCORDINGLY.");
                    amt=sc.nextInt();
                }
                chge=amt-250;
                System.out.println("YOUR CHANGE = "+chge+" CAN BE GIVEN AS:");
                note100=chge/100;
                chge=chge%100;
                note50=chge/50;
                chge=chge%50;
                note20=chge/20;
                chge=chge%20;
                note10=chge/10;
                if(note100>0)
                System.out.println("RS.100 NOTE = "+note100);
                if(note50>0)
                System.out.println("RS.50 NOTE = "+note50);
                if(note20>0)
                System.out.println("RS.20 NOTE = "+note20);
                if(note10>0)
                System.out.println("RS.10 NOTE = "+note10);
                System.out.println("THANK YOU FOR USING SNACK VENDING MACHINE");
                break;
                default:
                System.out.println("WRONG CHOICE");
            }
            break;   
            case 3:
            System.out.println("CHOOSE YOUR REQUIRED PEANUTS-");
            System.out.println("PRESS 1 FOR LEHAR PEANUTS @ RS.20");
            System.out.println("PRESS 2 FOR M&M PEANUTS@ RS.50");
            System.out.println("ENTER THE AMOUNT :");
            amt=sc.nextInt();
            if (amt<10 || amt>500)
            {
                amt=0;
                System.out.println("ENTER MONEY BETWEEN Rs.10- Rs.500");
                amt=sc.nextInt();
            }
            System.out.println("ENTER YOUR CHOICE:");
            ch3=sc.nextInt();
            switch(ch3)
            {
                case 1:
                System.out.println("YOUR CHOICE IS LEHAR PEANUTS");
                if(amt<20)
                {
                    amt=0;
                    System.out.println("INSUFFICIENT AMOUNT.PLEASE ENTER AMOUNT ACCORDINGLY.");
                    amt=sc.nextInt();
                }
                chge=amt-20;
                System.out.println("YOUR CHANGE = "+chge+" CAN BE GIVEN AS:");
                note100=chge/100;
                chge=chge%100;
                note50=chge/50;
                chge=chge%50;
                note20=chge/20;
                chge=chge%20;
                note10=chge/10;
                if(note100>0)
                System.out.println("RS.100 NOTE = "+note100);
                if(note50>0)
                System.out.println("RS.50 NOTE = "+note50);
                if(note20>0)
                System.out.println("RS.20 NOTE = "+note20);
                if(note10>0)
                System.out.println("RS.10 NOTE = "+note10);               
                System.out.println("THANK YOU FOR USING SNACK VENDING MACHINE");
                break;
                case 2:
                System.out.println("YOUR CHOICE IS M&M PEANUTS");
                if(amt<50)
                {
                    amt=0;
                    System.out.println("INSUFFICIENT AMOUNT.PLEASE ENTER AMOUNT ACCORDINGLY.");
                    amt=sc.nextInt();
                }
                chge=amt-50;
                System.out.println("YOUR CHANGE = "+chge+" CAN BE GIVEN AS:");
                note100=chge/100;
                chge=chge%100;
                note50=chge/50;
                chge=chge%50;
                note20=chge/20;
                chge=chge%20;
                note10=chge/10;
                if(note100>0)
                System.out.println("RS.100 NOTE = " +note100);
                if(note50>0)
                System.out.println("RS.50 NOTE = "+note50);
                if(note20>0)
                System.out.println("RS.20 NOTE = "+note20);
                if(note10>0)
                System.out.println("RS.10 NOTE = "+note10);               
                System.out.println("THANK YOU FOR USING SNACK VENDING MACHINE");
                break;
                default:
                System.out.println("WRONG CHOICE.");
            }
            break;
            case 4:
            System.out.println("CHOOSE YOUR REQUIRED BEVERAGES-");
            System.out.println("PRESS 1 FOR NESTEA @ RS.30");
            System.out.println("PRESS 2 FOR COCACOLA/FANTA/SPRITE 600ML @ RS.40");
            System.out.println("PRESS 2 FOR TROPICANA ORANGE 250ML @ RS.60");
            System.out.println("ENTER THE AMOUNT :");
            amt=sc.nextInt();
            if (amt<10 || amt>500)
            {
                amt=0;
                System.out.println("ENTER MONEY BETWEEN Rs.10- Rs.500");
                amt=sc.nextInt();
            }
            System.out.println("ENTER YOUR CHOICE:");
            ch4=sc.nextInt();
            switch(ch4)
            {
               case 1:
                System.out.println("YOUR CHOICE IS NESTEA");
                if(amt<30)
                {
                    amt=0;
                    System.out.println("INSUFFICIENT AMOUNT.PLEASE ENTER AMOUNT ACCORDINGLY.");
                    amt=sc.nextInt();
                }
                chge=amt-30;
                System.out.println("YOUR CHANGE = "+chge+" CAN BE GIVEN AS:");
                note100=chge/100;
                chge=chge%100;
                note50=chge/50;
                chge=chge%50;
                note20=chge/20;
                chge=chge%20;
                note10=chge/10;
                if(note100>0)
                System.out.println("RS.100 NOTE = "+note100);
                if(note50>0)
                System.out.println("RS.50 NOTE = "+note50);
                if(note20>0)
                System.out.println("RS.20 NOTE = "+note20);
                if(note10>0)
                System.out.println("RS.10 NOTE = "+note10);             
                System.out.println("THANK YOU FOR USING SNACK VENDING MACHINE");
                break;
                case 2:
                System.out.println("YOUR CHOICE IS COCACOLA/FANTA/SPRITE");
                if(amt<40)
                {
                    amt=0;
                    System.out.println("INSUFFICIENT AMOUNT.PLEASE ENTER AMOUNT ACCORDINGLY.");
                    amt=sc.nextInt();
                }
                chge=amt-40;
                System.out.println("YOUR CHANGE = "+chge+" CAN BE GIVEN AS:");
                note100=chge/100;
                chge=chge%100;
                note50=chge/50;
                chge=chge%50;
                note20=chge/20;
                chge=chge%20;
                note10=chge/10;
                if(note100>0)
                System.out.println("RS.100 NOTE = "+note100);
                if(note50>0)
                System.out.println("RS.50 NOTE = "+note50);
                if(note20>0)
                System.out.println("RS.20 NOTE = "+note20);
                if(note10>0)
                System.out.println("RS.10 NOTE = "+note10);              
                System.out.println("THANK YOU FOR USING SNACK VENDING MACHINE");
                break;
                case 3:
                System.out.println("YOUR CHOICE IS TROPICANA ORANGE");
                if(amt<60)
                {
                    amt=0;
                    System.out.println("INSUFFICIENT AMOUNT.PLEASE ENTER AMOUNT ACCORDINGLY.");
                    amt=sc.nextInt();
                }
                chge=amt-60;
                System.out.println("YOUR CHANGE = "+chge+" CAN BE GIVEN AS:");
                note100=chge/100;
                chge=chge%100;
                note50=chge/50;
                chge=chge%50;
                note20=chge/20;
                chge=chge%20;
                note10=chge/10;
                if(note100>0)
                System.out.println("RS.100 NOTE = "+note100);
                if(note50>0)
                System.out.println("RS.50 NOTE = "+note50);
                if(note20>0)
                System.out.println("RS.20 NOTE = "+note20);
                if(note10>0)
                System.out.println("RS.10 NOTE = "+note10);               
                System.out.println("THANK YOU FOR USING SNACK VENDING MACHINE");
                break;
                default:
                System.out.println("WRONG INPUT.");
            }
            break;
            default:
            System.out.println("WRONG INPUT.");
        }
    }
}

                
                
                
                
                


