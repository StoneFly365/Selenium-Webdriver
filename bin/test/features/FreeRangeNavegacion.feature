Feature: Navigation
  To see the subpages
  Without logging in
  I can click the navigation bar links

  # Scenario Outline: I can access the subpages through the navigation bar
  #   Given I navigate to www.freerangetesters.com
  #   When I go to <section> using the navigation bar
  #   # Then I am redirected to the right page
  #   Examples:
  #     | section   |
  #     | Cursos    |
  #     | Recursos  |
  #     | Blog      |
  #     | Mentorías |
  #     | Udemy     |
  #     | Academia  |

  Scenario: Courses are presented correctly to potencial customers
    Given I navigate to www.freerangetesters.com
    When I go to Cursos using the navigation bar
    And select Introduccion al Testing