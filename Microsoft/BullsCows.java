package Microsoft;

public class BullsCows {
	 public static String getHint(String secret, String guess) {
	        boolean[] arr=new boolean[secret.length()];
	        boolean[] arr1=new boolean[guess.length()];
	        int cow=0;
	        int bull=0;
	        for(int i=0;i<secret.length();i++){
	            if(secret.charAt(i)==guess.charAt(i)) {
	            	bull++;
	            	arr[i]=true;
	            	arr1[i]=true;
	            	
	            	
	            }
	        }
	        for(int j=0;j<secret.length();j++) {
	        	if(arr[j]==false) {
	        		for(int k=0;k<guess.length();k++) {
	        			if(secret.charAt(j)==guess.charAt(k)) {
	        				if(arr1[k]==false) {
	        					arr[j]=true;
	        					arr1[k]=true;
	        					cow++;
	                            break;
	        				}
	        				
	        			}
	        		}
	        		
	        	}
	        }
	        return bull+"A"+cow+"B";
	    }

	public static void main(String[] args) {
//		getHint("1807","7810");
		System.out.println(getHint("1123","0111"));
	}
}
