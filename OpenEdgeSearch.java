// import java.io.IOException;
// import java.net.URLEncoder;
// import java.nio.charset.StandardCharsets;
// import java.util.Random;

// public class OpenEdgeSearch {

//     public static void main(String[] args) {
//         // Array of random search queries
//         String[] searchQueries = {
//             "Java programming", "Artificial Intelligence", "Selenium WebDriver",
//             "Climate change", "Latest tech news", "Movie releases 2024",
//             "How to cook pasta", "Quantum computing", "NASA Mars mission",
//             "Health benefits of yoga", "Python tutorials", "Best coding practices",
//             "Future of AI", "Top 10 books to read", "Travel destinations 2024"
//         };

//         Random random = new Random();

//         for (int i = 0; i < 15; i++) {
//             // Select a random search query
//             int randomSearchIndex = random.nextInt(searchQueries.length);
//             String query = searchQueries[randomSearchIndex];

//             // Encode the query for URL usage
//             String encodedQuery = URLEncoder.encode(query, StandardCharsets.UTF_8);

//             // Construct the search URL (using Bing here, you can change it to Google or others)
//             String searchUrl = "https://www.bing.com/search?q=" + encodedQuery;

//             // Use a terminal command to open Microsoft Edge specifically
//             try {
//                 // This command works on macOS to open Microsoft Edge
//                 String[] command = { "open", "-a", "Microsoft Edge", searchUrl };
//                 Runtime.getRuntime().exec(command);
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }

//             // Optional: Wait for a second before opening the next search
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class OpenEdgeSearch {

    public static void main(String[] args) {
        // Array of random search queries
        String[] searchQueries = {
            "Java programming", "Artificial Intelligence", "Selenium WebDriver",
            "Climate change", "Latest tech news", "Movie releases 2024",
            "How to cook pasta", "Quantum computing", "NASA Mars mission",
            "Health benefits of yoga", "Python tutorials", "Best coding practices",
            "Future of AI", "Top 10 books to read", "Travel destinations 2024"
        };

        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            // Select a random search query
            int randomSearchIndex = random.nextInt(searchQueries.length);
            String query = searchQueries[randomSearchIndex];

            // Encode the query for URL usage
            String encodedQuery = URLEncoder.encode(query, StandardCharsets.UTF_8);

            // Construct the search URL (using Bing here, you can change it to Google or others)
            String searchUrl = "https://www.bing.com/search?q=" + encodedQuery;

            // Use a terminal command to open Microsoft Edge specifically
            try {
                // Command for Windows to open Microsoft Edge with a URL
                String[] command = {"cmd", "/c", "start", "msedge", searchUrl};
                Runtime.getRuntime().exec(command);
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Optional: Wait for a second before opening the next search
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}