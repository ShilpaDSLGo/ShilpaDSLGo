
@tag
Feature: LinkedList acessed by user

  @tag1
  Scenario: User is learning LinkedList by navigating through all below links
    Given User selects Linked List Page after logging in
    When User clicks introduction button
    Then User is directed to the Intorduction Page of Linked List

  @tag2
  Scenario Outline: Invalid code in linked list.
    Given User is on Introduction Page
    When User clicks Try Here and writes in-valid code in python
    Then User accept The pop - up block appears

  @tag3
  Scenario Outline: Valid code in linked list.
    Given User Clears the code
    When User clicks on in Try Here and writes valid code in python
    Then User checks for console
