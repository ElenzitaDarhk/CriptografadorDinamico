# CriptografadorDinamico
Serviço de Criptografia que tem por objetivo incialmente prover a um AppCliente uma configuração de criptografia simétrica composta por algorítmo de criptografia e chave pública.
Essa configuração estará ativa por um período de tempo. Sendo assim cada dado pode ser criptografado com uma configuração diferente. Por exemplo:

{
	"string": "José",
	"data": 2025-08-21,
} 

Configuração Ativa para esse AppCliente em 025-08-21, algorítmo RSA, chave "AppCliente01"


{
	"string": "José",
	"data": 2025-09-21,
} 

Configuração Ativa para esse AppCliente em 025-08-21, algorítmo RC4, chave "AppCliente03"


Use Case
(https://github.com/ElenzitaDarhk/CriptografadorDinamico/blob/Develop/CriptografadorDinamico-Objetos.jpg)

Objects Diagram
(https://github.com/ElenzitaDarhk/CriptografadorDinamico/blob/Develop/CriptografadorDinamico-Objetos.jpg)
