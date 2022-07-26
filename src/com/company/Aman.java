package com.company;

// import java.ObjectOutputStream;
// import java.FileOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Aman {
//    static detail obj = new detail();

    public static void main(String[] args) {
//        do{
//            System.out.println("------WELCOME TO THE COURIER SERVICE SYSTEM !---------\n ");
//            System.out.println("how may i help you,You can select from following options");
//            System.out.println("enter 0 if you are a new user");
//            System.out.println("enter 1 if you already registered and want to login");
//
//            // System.out.println("enter 2 if you want a new delivery");
//            // System.out.println("enter 3 if you want to register as you are going to abroad");
//            // System.out.println("enter 4 if you want to know recivers overview");
//
//
//            Scanner sc=new Scanner(System.in);
//            int n=sc.nextInt();
//
//
//            switch(n)
//            {
//                case 0:
//                    System.out.println("New User");
//                    obj.register();
//
//                    System.out.println("your registartion done successfully");
//
//                    break;
//                case 1:
//                    System.out.println(" enter your login deatils---");
//                    obj.Login();
//                    break;
//
//            }
//
//        }while(true);

//        persongoingregister();
    }

}



class detail
{


    public void register()
    {
        String firstname;
        String lastname;
        String username;
        String password;
        String Address;
        String email;
        String phone;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your firstname=");
        firstname=sc.nextLine();

        System.out.println("Enter lastName ");
        lastname=sc.nextLine();

        System.out.println("Enter username  ");
        username=sc.nextLine();

        System.out.println("Enter password ");
        password=sc.nextLine();

        System.out.println("Enter Address");
        Address=sc.nextLine();

        System.out.println("Enter email address ");
        email=sc.nextLine();
        System.out.println("enter your phone number=");
        phone=sc.nextLine();

    }
    public void Login()
    {
        String userName="Amandeep";
        String password="aman@7986";

        String username1="rajesh";
        String password1="rajesh@98779";
        String username2="rahul";
        String password2="rahul*3459";
        String Username;
        String Password;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your username=");
        Username=sc.next();
        System.out.println("enter password");
        Password=sc.next();



        if((Username.equals(userName) && Password.equals(password)) || (Username.equals(username1) && Password.equals(password1))|| (Username.equals(username2) && Password.equals(password2))){

            System.out.println("Login successfully!");
            System.out.println("now you can perform further actions");
            System.out.println("enter 2 if you want a new delivery");
            System.out.println("enter 3 if you want to register as you are going to abroad");
            System.out.println("enter 4 if you want to know recivers overview");
            System.out.println("enter 5 if you want to know about persons who are going abroad");
            int a=sc.nextInt();
            switch(a)
            {
                case 2:
                    System.out.println("New Delivery....");
                    System.out.println("enter details regarding new delivery");
                    newdelivery();
                    break;
                case 3:
                    System.out.println("----give your personal details----");
//                    persongoingregister();
                    break;
                case 4:
                    System.out.println("Receiver overview");
                    break;
                case 5:
                    System.out.println(" abroad going person details");
                    // display();
                    break;
                default:
                    System.out.println("wrong input");
            }




        }
        else
        {
            System.out.println("wrong login information!");
            System.out.println("again enter");
            Login();

        }





    }
    public void newdelivery()
    {
        String fromwhere;
        String towhere;
        String shipmenttype;
        String  equipmenttype;
        int weight;
        String servicetype;
        String Name;
        String Address;
        String phone;
        String city;
        String paymentmode;
        Scanner sc=new Scanner(System.in);
        System.out.println("from where you want to deliver=");
        fromwhere=sc.nextLine();

        System.out.println("to where you want to deliver the courier=");
        towhere=sc.nextLine();

        System.out.println("what is your shippment type document or other=");
        shipmenttype=sc.nextLine();

        System.out.println("tell your equipment type=");
        equipmenttype=sc.nextLine();

        System.out.println("weight of your equipment is=");
        weight=sc.nextInt();

        System.out.println("if weights is less than or equals to 200 then charges willbe zero");
        System.out.println("if weight is greater than 200 kg charges will be 200 per kg");
        if(weight<=200)
        {
            System.out.println("thus your charges are zero perkg");
        }
        else{
            System.out.println("thus your charges are 400perkg");
        }

        System.out.println(" Thus your new delivery details saved successfuly");
        System.out.println("now enter the details of receiver");
        System.out.println("enter the name of receiver=");
        Name=sc.nextLine();

        System.out.println("enter the delivery Address=");
        Address=sc.nextLine();

        System.out.println("enter the phone number=");
        phone=sc.nextLine();
        System.out.println("enter the city=");
        city=sc.nextLine();

        System.out.println("enter the payment mode=");
        paymentmode =sc.nextLine();



    }

    // public void display()
    // {


    //     ArrayList <String> al=new ArrayList<String>();
    //     // System.out.println(al);
    // }
}