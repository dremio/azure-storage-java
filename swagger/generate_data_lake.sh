autorest adlsg2.yaml \
  --reset \
  --use=https://github.com/Azure/autorest.java/releases/download/v2.0.24/microsoft.azure-autorest.java-2.0.24.tgz \
  --preview \
  --implementation-subpackage=implementation \
  --models-subpackage=models \
  --generate-client-interfaces=false \
  --required-parameter-client-methods=false \
  --client-type-prefix=Generated \
  --add-context-parameter=true
