class solution{
public static int findProduct(int arr[], int n)
{
 if (n == 0)
 {
 return(arr[n]);
 }
 else
 {
 return (arr[n] * findProduct(arr, n - 1));
 }
}
}