package in.nikhil;

public class Test {
	
	public static void main(String[] args) {
		
		String name="nikhil";
		char ch[]=name.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			
			for(int j=0;j<ch.length;j++)
			{
				if(j<i && ch[j] == ch[i])
				{
					break;
				}
				if(ch[i]== ch[j])
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(ch[i]+ "= "+count);
			}

		}
	}

}
