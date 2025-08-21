# Detalhamento dos Casos de Uso

![Alt text](https://github.com/ElenzitaDarhk/CriptografadorDinamico/blob/Develop/CriptografadorDinamico-UseCase.jpg "Use Case")

<h2>Gerenciar Configuração de Criptografia</h2>

<h3>Premissas</h3>
1. Um usuário deverá estar devidamente autorizado e autenticado para utilizar a funcionalidade.<br>
2. Os algorítmos de criptografia deverão estar previamente cadastrados.
<h3>Fluxo Básico - Primeira Configuração</h3>
1. Deverá ser selecionado um algorítmo de criptografia simétrica.<br>
2. Deverá ser escolhida uma chave de criptografia.<br>
3. O algorítmo selecionado e a chave deverão passar por validação de dados.<br>
4. Cadastrar a configuração como ativa com o algorítmo, a chave e o appClient do usuário associados entre si e a uma data inicial de validade.
<h4>Resultado Esperado</h4>
Inserir uma configuração com a data inicial de validade é a data do cadastro com os dados informados para o appClient do usuário.
<h3>Fluxo Alternativo - Outra Configuração</h3>
1. Deverá ser selecionado um algorítmo de criptografia simétrica.<br>
2. Deverá ser escolhida uma chave de criptografia.<br>
3. O algorítmo selecionado e a chave deverão passar por validação de dados.<br>
4. Cadastrar a configuração como ativa com o algorítmo, a chave e o appClient do usuário associados entre si e a uma data inicial de validade.
<h4>Resultado Esperado</h4>
Inserir uma nova configuração com a data inicial de validade é a data do cadastro com os dados informados para o appClient do usuário. Desativar a configuração anterior por meio de uma flag e inserir a data final de validade com a data de cadastro da nova configuração.

<h2>Recuperar Configuração de Criptografia</h2>
<h3>Premissas</h3>
1. Um usuário deverá estar devidamente autorizado e autenticado para utilizar a funcionalidade.<br>
2. Pelo menos uma configuração deverá estar previamente cadastrada e ativa para AppClient ao qual o usuário estará associado.
<h3>Fluxo Básico - Recuperar configuração ativa atualmente</h3>
1. Deverá ser obtido atráves da associação entre usuário, appClient e configuração qual é a configuração que está ativa.<br>
2. Devolver a ultima configuração ativa.
<h4>Resultado Esperado</h4>
Fornecer a ultima configuração ativa para o appClient do usuário.
<h3>Fluxo Básico - Recuperar configuração uma configuração anterior</h3>
1. Deverá ser obtido atráves da associação entre usuário, appClient e configuração qual é a configuração que está ativa.<br>
2. Deverá ser fornecida a data origem do registro que será descriptografado.
3. Devolver a configuração que estava ativa na data origem do registro.
<h4>Resultado Esperado</h4>
Fornecer a configuração ativa para o appClient do usuário na data origem do registro.
