Buatlah sebuah program kalkulator BMI (Body Mass Index).

Indeks massa tubuh (body mass indeks) atau disingkat BMI adalah pengukuran yang digunakan untuk menentukan golongan berat badan sehat dan tidak sehat.

Program ini menerima 3 inputan berupa `Usia`, `Berat Badan (kg)`, dan `Tinggi Badan (m)`.

Mengukur BMI dapat menggunakan rumus berikut.

![Rumus BMI](https://cdn.hellosehat.com/wp-content/uploads/2016/08/bmiformula-metric.png)

Kemudian, tampilkan hasil perhitungan BMI dan tentukan termasuk dalam kategori apakah hasil perhitungan tersebut.

- Di bawah 18,5 = Berat badan kurang.
- 18,5 – 22,9 = Berat badan normal.
- 23 – 29,9 = Berat badan berlebih (kecenderungan obesitas).
- Di atas 30 = Obesitas

Perlu diperhatikan bahwa perhitungan BMI hanya berlaku untuk usia 18 tahun ke atas.


#### Contoh 1
Input
```
18
80
1.75
```

Output
```
26.122448979591837
Berat badan berlebih (kecenderungan obesitas)
```
Penjelasan: Usia 18, Berat Badan 80 kg, dan Tinggi Badan 1,75 m.


#### Contoh 2
Input
```
25
45
1.68
```

Output
```
15.94387755102041
Berat badan kurang
```



#### Contoh 3
Input
```
15
50
1.50
```

Output
```
Usia tidak mencukupi
```