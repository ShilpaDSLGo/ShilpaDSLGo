Feature: User is learning Stack Data Structure

@tag1

Scenario: User wants to learn and explore Stack

Given User is logged in and selects Stack from Data Structures

When User clicks on Operations in Stack

Then User is on Operations in Stack page

@tag2

Scenario Outline:

Given User navigates back to Operations Page

When User scrolls down on Try Here and writes valid code in python

Then User checks for stack console

@tag3

Scenario Outline:

Given User is going back to Operations Page

When User clicks on Try Here and writes in-valid code

Then User accepts pop-up

