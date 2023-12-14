package comparatorDemo;

public class frequencyOfWords {
	public static void main(String[] args) {
		
	
		
String s1="corenutsTechnology";
char[] ch=s1.toCharArray();
int [] frequency=new int[ch.length];
int count=1;
for(int i=0;i<frequency.length;i++)
{
	for(int j=i+1;j<frequency.length;j++)
	{
		if(ch[i]==ch[j])
		{
			frequency[j]=-1;
			count++;
					
		}
	}

	if(frequency[i]!=-1)
		{
			frequency[i]=count;
		}
}
		for(int k=0;k<frequency.length;k++)
		{
			if(frequency[k]!=-1)
			System.out.println(ch[k]+" "+frequency[k]);
		}
	}
}


