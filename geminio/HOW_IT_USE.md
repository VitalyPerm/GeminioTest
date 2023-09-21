# How to use feature module template (sorry for instruction, but geminio plugin is not perfect)

**Start wizard**

Choose "Project" view in source tree

Select root element in tree (gorodpay.android)

Call context menu (right click)

Choose "New"

Choose "GorodPay Modules"

Choose "GorodPayFeatureModule"

**Enter parameters in wizard**

Enter "Module name" (for example "yournewfeature")

Clear "Module's classes prefix"

Clear "Package name"

Enter "Feature Module Name" (the same as "Module name")

Enter "Feature Name" (for example "YourNewFeature")

Enter "Feature Package" (for example "ru.gazprombank.gorodpay.yournewfeature")

Enter "Feature Fragment Layout" (for example "your_new_feature").
I strongly recomend to use auto generated value.
It will be used for store state and fragment layout

**Finish wizard**

Click "Next"

Click "Disable all"

Click "Next"

Click "Disable all"

Click "Finish"

**Post actions**

Rollback all changes which plugin made in "gorodpay.android/settings.gradle"

Add generated module in section "features" in "gorodpay.android/build_scripts/modules.gradle"

Click "Sync Project with Gradle Files"

Remove unused code from module

Analyze in module all TODO

Implement module

# Использвание subfeature шаблона

Шаблон генерирует подфичу в уже существующем модуле 

* Выбрать модуль, правый клик по модулю

* Выбрать New

* Выбрать GorodPay Templates

* Выбрать GorodPaySubfeatureTemplate

* Ввести данные в визарде. Поле SubfeatureName должно начинаться с заглавной буквы. В поле Module Name 
ввести имя модуля, в которое добавляется subfeature. 
  
* Нажать Finish
