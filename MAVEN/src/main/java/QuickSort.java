class QuickSort{
	int partition(int arr[], int l, int r)
    {
        int pivot = arr[r]; 
        int i = (l-1);
        for (int j=l; j<r; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
 
        return i+1;
    }
 
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            int pi = partition(arr, l, r);
            sort(arr, l, pi-1);
            sort(arr, pi+1, r);
        }
    }
}
}
