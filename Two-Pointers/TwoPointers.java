/*Given a array of Integers find a pair that sums to a given number x
O(N) rather than O(N^2) from brute force

Make sure the array is sorted for the msot part it should be sorted some exceptions I don't know about.
*/
int left = 0; int right = 0; int sum = arr[0];
for(right = 0; right < n; right++){
  sum += arr[right];
  while(sum > x && left < right){
    sum -= arr[left];
    left++;
  }
  if(sum == x){
    break;
  }
}
