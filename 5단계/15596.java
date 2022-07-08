class Test{
  long sum(int[] a) {
    long sum = 0; //합 저장

    for(int i = 0; i <a.length; i++) {
      sum += a[i];
    }    

    return sum;
  }
}
