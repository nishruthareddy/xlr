import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username,pwd;
        do{
            System.out.print("enter your credentials");
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            System.out.print("Enetr pwd: ");
            pwd = scanner.nextLine();
        }
        while((!username.equals("nishu_001"))||(!pwd.equals(" nishu_001")));
        System.out.println("sucessfully logined"); 
        
    }
}