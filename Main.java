    import java.util.Scanner;
    public class Main {
        public static void main(String[] args)
        {

            Scanner input = new Scanner(System.in);
            System.out.println("What do you want to do?\nPress 1 to create an account\nPress 2 to create a community\nPress 3 to edit your profile\nPress 4 to send a message ");
            int option = input.nextInt();

            IFace_create_account iface = new IFace_create_account();
            if(option == 1){
                iface.createAccount();
            }
            else if(option == 2){
                iface.addCommunity();
            }
            else if(option == 3){
                iface.editProfile();
            }
            else if(option == 4){
                iface.sendMessage();
            }
            input.close();
        }
        
    }
