import br.sample.Client;

class StartSample {
	public static void main(String[] args) {
		
		Client client = new Client();
		
		client.firstName = "Anderson";
		client.lastName = "Sousa";
		client.email = "contato@andersonbraz.com";
		
		System.out.println("Hello Git!");
		
		client.singup();
		
	}
}