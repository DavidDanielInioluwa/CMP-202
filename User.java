package OOP;

public class User {
    String name;
    String password;


    String login(){
      return "logged In";
    }

    String Register(){
        if(name.equals("Daniel") || password.equals("12345")){
            return "can't be Empty";
        }
        else {
            return "Successfully Registered";
        }
    }
}
