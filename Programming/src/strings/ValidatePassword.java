package strings;

public class ValidatePassword {
	public static void main(String[] args) {
		
		String password="Nithya@123";
		
		int uc=0;
		int lc=0;
		int num=0;
		int space=0;
		int special=0;
		
		if(password.length()>=8 && password.length()<=15) {
			for(int i=0; i<password.length(); i++) {
				char ch=password.charAt(i);
				
				if(ch>='A' && ch<='Z') {
					uc++;
				}else if(ch>='a' && ch<='z') {
					lc++;
				}else if(ch>='0' && ch<='9') {
					num++;
				}else if(ch==' ') {
					space++;
				}else {
					special++;
				}
			}
			if(uc>0 && lc>0 && num>0 && space==0 && special>0) {
				System.out.println("Password Valid");
			}else {
				System.out.println("Password Invlaid");
			}
			
		}else {
		System.out.println("Password Invlaid");
			
		}
		
		
	}

}
