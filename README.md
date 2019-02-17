# Microsoft Azure Storage SDK v10 for Java with Data Lake Gen2 Support

- See the swagger directory for the bash script used to generate the additional bindings.
- Built off of a slightly modified version of [2018-11-09 Data Lake Swagger Definition](https://github.com/Azure/azure-rest-api-specs/blob/master/specification/storage/data-plane/Microsoft.StorageDataLake/stable/2018-11-09/DataLakeStorage.json). Main change is adding scheme to protocol so you can control http versus https.
- Shades the com.microsoft.azure.blob package so that Jar can coexist with signed version of v8 drivers
 
