import java.util.Scanner;

// Nesta primeira etapa adicionei as seguintes funções:
// 1 - Criação de conta
// 2 - Criação de comunidade
// 3 - Criação/Edição de Perfil
// 4 - 
public class IFace_create_account{
    String[] name;
    String[] login;
    String[] pass;
    int count = 0;

    public IFace_create_account () {

    }
    
    //CREATE AN ACCOUNT
    public void createAccount() {

        this.name = new String[300];
        this.login = new String[300];
        this.pass = new String[300];

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
        this.count++;
        new_name.close();
        new_login.close();
        new_pass.close();
    }

    //CREATE A COMMUNITY
    public void addCommunity() {

        String[] community_name;
        String[] community_description;
        int count = 3;

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
    //EDIT PROFILE
    public void editProfile() {
        
        Scanner edit = new Scanner(System.in);
        System.out.println("What do you want to edit?\nPress 1 to edit name\nPress 2 to edit login\nPress 3 to edit password");
        int option = edit.nextInt(), new_count = 0;
        
        Scanner edtuser = new Scanner(System.in);
        System.out.println("What is your username?");
        String edit_user = edtuser.nextLine();

        Scanner edtuser2 = new Scanner(System.in);
        System.out.println("What is your password?");
        String edit_pass = edtuser2.nextLine();

        while(new_count < this.count)
        {
            if(this.login[new_count] == edit_user && this.pass[new_count] == edit_pass)
            {   
                Scanner newedit = new Scanner(System.in);
                if(option == 1)
                {
                    System.out.println("Type your new name: ");
                    this.name[count] = newedit.nextLine();
                }
                else if(option == 2)
                {
                    System.out.println("Type your new login: ");
                    this.name[count] = newedit.nextLine();
                }
                else if(option == 3)
                {
                    System.out.println("Type your new password: ");
                    this.name[count] = newedit.nextLine();
                }
                newedit.close();
            }
            else if(new_count == this.count){
                System.out.println("User not found or user and password don't match!");
            }
            else{
                new_count++;
            }
        }
        edit.close();
        edtuser.close();
        edtuser2.close();
    }
}
