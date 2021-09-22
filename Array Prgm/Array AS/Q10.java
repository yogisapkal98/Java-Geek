package assignmeny9array;


		public class Q10 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int a[]={1,2,3,4};
				for(int i=0;i<a.length;i++)
				{
					for(int j=i+1;j<a.length;j++)
					{
						if(a[i]>a[j])
						{
							int temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						}
					}
					
				}
				
				for(int i=0;i<a.length;i++)
				{
					System.out.println(a[i]);
				}
				
					System.out.println("second last element="+a[a.length-2]);
				
				

			}

		}

		
		
	