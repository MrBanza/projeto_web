Feature: Fazer a compra de produtos
  Scenario: fluxo de venda cliente logado
    Given : usuario esteja logado no portal
    When : usuario escolhe por Printed Chiffon Dress na cor verde e tamanho M
    And : Faded Short Sleeve T-shirts na cor azul
    And : Blouse na quantidade dois
    And : Printed Dress
    Then : produtos sao selecionados para compra