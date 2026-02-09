import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Candy candy = new Candy("peppermint", "2");
        while(true){
            System.out.println("[view] candy, [add] candy, [edit] candy [remove] candy or q to quit");
            System.out.print("> ");
            String userinput = scanner.nextLine();

            if(userinput.equals("view")){
                candy.viewCandies();
            }
            else if (userinput.equals("add")) {
                System.out.println("What candy would you like to add? ");
                String newCandy = scanner.nextLine();
                System.out.println("How much? ");
                String newStock = scanner.nextLine();
                candy.addCandy(newCandy, newStock);
            }

            else if (userinput.equals("edit")) {
                System.out.println("What candy would you like to edit? ");
                String newCandy = scanner.nextLine();
                System.out.println("How much stock? ");
                String newStock = scanner.nextLine();
                candy.updateCandy(newCandy, newStock);
            }

            else if (userinput.equals("remove")){
                System.out.println("What candy would you like to remove? ");
                String deleteCandy = scanner.nextLine();
                System.out.println("What stock would you like to remove? ");
                String deleteStock = scanner.nextLine();
                candy.removeCandy(deleteCandy, deleteStock);
            }

            else {
                break;
            }
        }
    }
}