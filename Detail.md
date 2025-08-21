# Detalhamento dos Casos de Uso

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


# Class Diagram
