//Search element in unsorted arrya

class Searcharray{

    void findElement(int arr[] ,int n ,int key)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("found element "+key "at"+arr[i]);
            }
            else
            {
                System.out.println("element not found in array");
            }
        }
    }


    public static void main(String[] args)
    {
        int arr[]={12,63,14,55,16,17,20,45,23};
        int n=arr.lenght();
        int key =16;

        Searcharray s=new Searcharray();

        s.findElement(arr,n,key);
    }
 
}
