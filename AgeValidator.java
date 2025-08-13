
public class AgeValidator {
    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) { // Custom error condition
            throw new InvalidAgeException("Age must be between 0 and 150. Given age: " + age);
        }
    }
}
