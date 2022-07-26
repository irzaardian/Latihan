### Deskripsi
Diberikan sebuah matrix 2 dimensi `m` dengan semua elemen integer, hitunglah sum dari baris diagonal kiri dan kanan matrix tersebut.

Matrix `m` didefinisikan di dalam program.

Elemen-elemen yang dihitung diambil dari semua elemen pada diagonal kiri dan sisa elemen pada diagonal kanan.

Matrix harus berbentuk matrix persegi `n x n`.


### Contoh 1
```
m = [
  [1,2,3], 
  [4,5,6], 
  [7,8,9]
]
```
Output
```
25
```
Penjelasan: Sum diagonalnya adalah `1 + 5 + 9 + 3 + 7 = 25`. Elemen yang sudah diambil dari diagonal kiri (`m[1][1] = 5`) tidak dihitung lagi.



### Contoh 2
```
m = [
  [1,1,1,1],
  [1,1,1,1],
  [1,1,1,1],
  [1,1,1,1]
]
```
Output
```
8
```



### Contoh 3
```
m = [[5]]
```
Output
```
5
```