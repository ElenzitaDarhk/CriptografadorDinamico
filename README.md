# CriptografadorDinamico
Serviço de Criptografia que tem por objetivo incialmente prover a um AppCliente uma configuração de criptografia simétrica composta por algorítmo de criptografia e chave pública.
Essa configuração estará ativa por um período de tempo. Sendo assim cada dado pode ser criptografado com uma configuração diferente. Por exemplo:

{
	"string": "José",
	"data": 2025-08-21
} 

Configuração Ativa para esse AppCliente em 25-08-21, algorítmo RSA, chave "AppCliente01"


{
	"string": "José",
	"data": 2025-09-21
} 

Configuração Ativa para esse AppCliente em 25-09-21, algorítmo RC4, chave "AppCliente03"

# Use Case
![Alt text](/CriptografadorDinamico-UseCase.jpg "Use Case")

# Objects Diagram
![Alt text](/CriptografadorDinamico-Objetos.jpg "Objects Diagram")

# Detalhamento
[1. Detalhamento dos Casos de Uso](/Detail.md).
