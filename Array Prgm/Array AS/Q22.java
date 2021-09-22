package assignmeny9array;



public class Q22{

	void firstsub(int arr[],int arr_length,int sub_arr_len){
		int min_avg=(arr[0]+arr[1]+arr[2])/3;
		int index = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if((arr[i]+arr[j]+arr[k])/3 < min_avg)
					{
						min_avg = (arr[i]+arr[j]+arr[k])/3;
						index = i;
					}
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					i=j;
					j=k;
				}
			}
		}
		System.out.println("Min_Avg : "+min_avg);
		System.out.println("Index of sub array : "+index);
	}
	public static void main(String[] args) {
		int arr[]={3,7,90,20,5,50,40};

		Q22 q22 = new Q22();
		q22.firstsub(arr,arr.length,3);
	}

}
