import java.util.Scanner;

public class iFace_create_account{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to do?\nPress 1 to create an account\nPress 2 to create a community ");
        int option = input.nextInt();
        if(option == 1){
            createAccount();
        }
        else if(option == 2){
            addCommunity();
        }
        input.close();
    }
    //CREATE AN ACCOUNT
    public static void createAccount() {
        String[] name;
        String[] login;
        String[] pass;
        int count = 0;

        name = new String[300];
        login = new String[300];
        pass = new String[300];

        //User put his name
        Scanner new_name = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name[count] = new_name.nextLine();
        
        //User put his login
        Scanner new_login = new Scanner(System.in);
        System.out.println("Enter your login: ");
        login[count] = new_login.nextLine();

        //User put his password
        Scanner new_pass = new Scanner(System.in);
        System.out.println("Enter your password: ");
        pass[count] = new_pass.nextLine();

        //System.out.printf("%s %s %s%n", name[count], login[count], pass[count]);

        new_name.close();
        new_login.close();
        new_pass.close();
    }

    //CREATE A COMMUNITY
    public static void addCommunity() {

        String[] community_name;
        String[] community_description;
        int count = 0;

        community_name = new String[30];
        community_description = new String[300];

        //User put the community name
        Scanner new_community_name = new Scanner(System.in);
        System.out.println("Enter the community name: ");
        community_name[count] = new_community_name.nextLine();

        //User put the community description
        Scanner new_description = new Scanner(System.in);
        System.out.println("Enter the community description: ");
        community_description[count] = new_description.nextLine();
        
        new_community_name.close();
        new_description.close();
    }
}
