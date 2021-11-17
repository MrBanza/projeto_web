Feature: login usuario
  Scenario: logar usuario
    Given usuario deseja logar-se em automationpractice.com
    When navego para o menu de login
    And preencho os campos com "usuario" e "senha"
    Then finalizo o login de cliente