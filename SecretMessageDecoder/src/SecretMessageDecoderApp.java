
import java.util.Scanner;
public class SecretMessageDecoderApp
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the char to be decoded:");
        char ch = scan.next().charAt(0);

        SecretMessageDecoder decoder = new SecretMessageDecoder();
        System.out.println(decoder.decodeCharacter(ch));
	}
}
