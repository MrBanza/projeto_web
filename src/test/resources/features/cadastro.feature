Feature: cadastrar usuario
  Scenario: fizer o cadastro de um novo usuario
    Given usuario deseja cadastrar-se em automationpractice.com
    When navegar para o menu de login
    And adiciono endereco de email
    And clico em create an account
    And redirecionado a tela de cadastro
    And preencho os campos necessarios
    Then novo usuario cadastrado para logar na pagina
