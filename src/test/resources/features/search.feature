Feature: Amazon Search Functionality

  @wip
  Scenario Outline: Book Search

# Landing page
    Given the user is on the url
    When the user selects section "<Category>"
    And searchs "<Product>"
    Then the user should see the result "<Search Result>"

#Search result page
    Given selected type is "<Type>"
    And the price is "<Price>"
    When the user navigates to book details

#First item page
    Then item title,badge,price and type should be the same


#Added to basket page
    Given item is added to the basket
    And item number in the basket is correct
    And the user edit the basket

#Basket_page
    Then title,badge,price and type should be the same
    And get the quantity on the page

    Examples:
      | Category | Product                           | Search Result                               | Price | Type      |
      | Books    | Harry Potter and the Cursed Child | Harry Potter and the Cursed Child           | 4.00  | Paperback |
#      | Books    | Fantastic Beasts Book             | Fantastic Beasts: The Secrets of Dumbledore | 10.00 | Hardcover |
#      | Books    | Roald Dahl                        | Roald Dahl Collection                       | 27.95 | Paperback |
