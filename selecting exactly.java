
import java.util.Collect

public class RandomLines {
    public static void main(String[] args) {
        

        for (int i = 0; i < 100; i++) {
            int choice = rand.nextInt(5);
            
                
                    lines.add("System.out.println(\"Hello, world!\");");
                    break;
                case 1:
                    lines.add("int x = " + rand.nextInt(100) + ";");
                    break;
                case 2:
                    lines.add("double y = " + rand.nextDouble() + ";");
                    break;
                case 3:
                    lines.add("String s = \"" + generateRandomString(rand) + "\";");
                    
                case 4:
                    lines.add("boolean b = " + rand.nextBoolean() + ";");
                    break;
            }
        }

        Collections.shuffle(lines);

        for (String line : lines) {
            System.out.println(line);
        }
    }

    private static String generateRandomString(Random rand) {
        int length = rand.nextInt(10) + 5;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = (char) (rand.nextInt(26) + 'a');
            sb.append(c);
        }
        return sb.toString();
    }
}