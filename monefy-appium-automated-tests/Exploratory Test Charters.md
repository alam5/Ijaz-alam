## Following are the Exploratory Testing Charters for the Monefy App

**Test Charter-01** |Check overall UI/UX of the application and user workflows |
|------------------|----------------------------------------------------------|
| **Priority Reason** | High: Monefy app has a lot of visual representation and graphs that illustrate financial data. |
| **Application**   | Monefy application                                       |
| **Environment**   | Production                                              |
| **Test Device**   | Google Pixel 9 Pro XL                                   |
| **Platform**      | Android                                                |
| **Duration**      | 60 mins                                                |
| **Bugs**          | 1. The Pie Donut chart does not accurately visualize data when all expense categories are added. <br> 2. The font size for newly created accounts is too small, making it difficult to read. <br> 3. The left menu opens unexpectedly when the user clicks the back button while the right menu is open. <br> 4. There is no "Clear All" button available on the numeric keyboard. <br> 5. Deleting a record does not prompt a confirmation message. <br> 6. The line annotation for categories does not function correctly when expenses increase. <br> 7. The top menu overlaps with the search results menu and the delete icon when displayed. <br> 8. It is challenging to tap the ‘delete’ and ‘search’ icon located in the top right corner. <br> 9. When a user long taps on a record, they can still perform other operations on the screen. <br> 10. Two burger menus appear below and beside the "Balance" section, which slide open upwards. Typically, burger menus are located in the top left or right corners of apps. <br> 11. Expenses are displayed below the "Balance" section, which may cause confusion. |

| **Test Charter-02** | Check that adding Balance and Expense calculations are working as expected |
|------------------|--------------------------------------------------------------------------|
| **Priority Reason** | High: Balance and expense functionality are very critical for financial apps like Monefy. |
| **Application**   | Monefy application                                                     |
| **Environment**   | Production                                                            |
| **Test Device**   | Google Pixel 9 Pro XL                                                 |
| **Platform**      | Android                                                              |
| **Duration**      | 60 mins                                                              |
| **Bugs**          | 1. Smaller expense percentage value is rounded to zero when other expenses are very high. <br> 2. Colors change when the user taps and holds on category icons. |

 **Test Charter-03** | Check Account creation workflow                                 |
|------------------|------------------------------------------------------------------|
| **Priority Reason** | Highest: Monefy app has a lot of visual representation and graphs. |
| **Application**   | Monefy application                                              |
| **Environment**   | Production                                                     |
| **Test Device**   | Google Pixel 9 Pro XL                                          |
| **Platform**      | Android                                                       |
| **Duration**      | 2 hrs                                                        |
| **Bugs**          | 1. Initial account balance does not appear in total balance amount. <br> 2. When creating an account, placeholder text ‘Name’ appears as entered text. <br>|

 **Test Charter** | Verify Search functionality                                     |
|------------------|--------------------------------------------------------------------|
| **Priority Reason** | Medium                                                           |
| **Application**   | Monefy application                                                |
| **Environment**   | Production                                                       |
| **Test Device**   | Google Pixel 9 Pro XL                                            |
| **Platform**      | Android                                                         |
| **Duration**      | 2 hrs                                                          |
| **Bugs**          | 1. Top bar overlaps with search query when entered. <br> 2. When using less than or greater operators (e.g., “<500” or “>500”), search results show values = 500. |

## What kind of risks do you need to mitigate for this type of application?

**Answer:** Following are the risks that need to be mitigated in Monefy App:

1. **UI/UX Improvements:** The user journey within the app is challenging to comprehend, and the overall user experience requires significant enhancements to ensure clarity and ease of use. The app needs to be more user-friendly.

2. **Functionality:** The process of adding and tracking expenses and income over extended periods is not intuitive. Deleting an expense or deposit category removes all associated historical amounts, and there is currently no way to review past transactions, which can lead to confusion and potential data loss.

3. **User Accessibility:** From an accessibility standpoint, the use of colorful representations of donut charts for expenses may pose difficulties for individuals who are colorblind or elderly. It's essential to implement more inclusive design choices to accommodate all users.

4. **Calendar Dates:** Users are currently able to add expenses for dates that are far in the past or far in the future, which is not a practical feature and may lead to confusion in financial tracking.


