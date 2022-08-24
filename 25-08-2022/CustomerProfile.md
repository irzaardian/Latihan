### Description
Create a `customer_profile` table with definitions as below:

| Field        | Type      | Length | Note                                                   |
|--------------|-----------|--------|--------------------------------------------------------|
| customer_id   | int       | 11     | PK                                                     |
| customer_name | varchar   | 100    |                                                        |
| address      | text      |        |                                                        |
| gender       | varchar   | 1      | can be M/F                                             |
| currency     | varchar   | 3      | can be IDR/USD/JPY                                     |
| loan_amount   | decimal   |        | maximum length 15 and rounded to 2 digits behind comma |
| created_date  | timestamp |        | auto generated every time insert data                  |





Suppose there are some data already inserted in the table:

| customer_id | customer_name | address                 | gender | currency | loan_amount | created_date        |
|-------------|---------------|-------------------------|--------|----------|-------------|---------------------|
| 1           | Irza          | Perum Bukit Sejahtera   | M      | IDR      | 10000.00    | 2022-08-25 00:58:11 |
| 2           | Dini          | Perum Dosen Unsri       | F      | USD      | 4000.00     | 2022-09-25 20:20:00 |
| 3           | Dhila         | Puri Primacom Residence | F      | JPY      | 2450.00     | 2022-10-25 14:59:09 |




Create a query to display the data as follows
| ID Nasabah | Nama  | Alamat                  | Jenis Kelamin | Mata Uang | Jumlah Pinjaman | Tanggal Pinjaman  |
|------------|-------|-------------------------|---------------|-----------|-----------------|-------------------|
| 1          | Irza  | Perum Bukit Sejahtera   | M             | Rupiah    | 10,000.00       | 25 Agustus 2022   |
| 2          | Dini  | Perum Dosen Unsri       | F             | US Dollar | 4,000.00        | 25 September 2022 |
| 3          | Dhila | Puri Primacom Residence | F             | Yen       | 2,450.00        | 25 Oktober 2022   |


Provide all SQL files in one directory `CustomerProfile`.