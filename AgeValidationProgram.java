public class AgeValidationProgram {
    public static void main(String[] args) {
        int ageToCheck = -1; // Example of an invalid age
        
        try {
            // Validate the age and throw an exception if it's invalid
            AgeValidator.validateAge(ageToCheck);
            System.out.println("Age is valid.");
        } catch (InvalidAgeException e) {
            // Handle the custom exception
            System.err.println("Caught exception: " + e.getMessage());
        }
    }
}
