{"action": "modify", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"13\",\"Version\":\"2\",\"Level\":\"4\",\"Task\":\"13\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2020-07-04T14:18:58.2687126Z\"},\"EventRecordID\":\"306346\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"3400\",\"ThreadID\":\"4136\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"MSEDGEWIN10\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"Name\":\"RuleName\",\"text\":\"Persistence - Hidden Run value detected\"},{\"Name\":\"EventType\",\"text\":\"SetValue\"},{\"Name\":\"UtcTime\",\"text\":\"2020-07-04 14:18:58.231\"},{\"Name\":\"ProcessGuid\",\"text\":\"{747f3d96-8fd2-5f00-0000-0010c15d2200}\"},{\"Name\":\"ProcessId\",\"text\":\"3728\"},{\"Name\":\"Image\",\"text\":\"C:\\\\Users\\\\Public\\\\tools\\\\evasion\\\\a.exe\"},{\"Name\":\"TargetObject\",\"text\":\"HKLM\\\\SOFTWARE\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Run\\\\\"},{\"Name\":\"Details\",\"text\":\"\\\"c:\\\\windows\\\\tasks\\\\taskhost.exe\\\"\"}]}}}", "category.generic": "Registry Object", "category.high": "System Management", "category.low": "Manipulation", "event_src.category": "Other", "event_src.fqdn": "msedgewin10", "event_src.host": "msedgewin10", "event_src.hostname": "msedgewin10", "event_src.rule": "Persistence - Hidden Run value detected", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Sysmon_13_Registry_value_changed", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "13", "normalized": true, "object": "reg_object", "object.fullpath": "\\registry\\machine\\software\\microsoft\\windows\\currentversion\\run\\", "object.new_value": "\"c:\\windows\\tasks\\taskhost.exe\"", "object.path": "\\registry\\machine\\software\\microsoft\\windows\\currentversion\\run\\", "object.property": "value", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-12T19:17:17.180Z", "status": "success", "subject.process.fullpath": "c:\\users\\public\\tools\\evasion\\a.exe", "subject.process.guid": "747f3d96-8fd2-5f00-0000-0010c15d2200", "subject.process.id": "3728", "subject.process.name": "a.exe", "subject.process.path": "c:\\users\\public\\tools\\evasion\\", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2020-07-04T14:18:58.231Z", "type": "raw", "uuid": "7e5ba700-f8f5-4874-a4ac-2a91c9dddd47"}
{"action": "modify", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"13\",\"Version\":\"2\",\"Level\":\"4\",\"Task\":\"13\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2023-06-12T18:30:51.2794969Z\"},\"EventRecordID\":\"48185854\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"3636\",\"ThreadID\":\"4616\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"win10-work.stand2008.local\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"Name\":\"RuleName\",\"text\":\"T1547_001,Create Persistance: Registry Run Keys\"},{\"Name\":\"EventType\",\"text\":\"SetValue\"},{\"Name\":\"UtcTime\",\"text\":\"2023-06-12 18:30:51.264\"},{\"Name\":\"ProcessGuid\",\"text\":\"{2b856446-645b-6487-ba09-00000000c100}\"},{\"Name\":\"ProcessId\",\"text\":\"2460\"},{\"Name\":\"Image\",\"text\":\"C:\\\\Windows\\\\system32\\\\reg.exe\"},{\"Name\":\"TargetObject\",\"text\":\"HKLM\\\\SOFTWARE\\\\WOW6432Node\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\RunOnce\\\\CalcImplant\"},{\"Name\":\"Details\",\"text\":\"C:\\\\Windows\\\\System32\\\\calc.exe\"},{\"Name\":\"User\",\"text\":\"STAND2008\\\\Администратор\"}]}}}", "category.generic": "Registry Object", "category.high": "System Management", "category.low": "Manipulation", "event_src.category": "Other", "event_src.fqdn": "win10-work.stand2008.local", "event_src.host": "win10-work.stand2008.local", "event_src.hostname": "win10-work", "event_src.rule": "T1547_001,Create Persistance: Registry Run Keys", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Sysmon_13_Registry_value_changed", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "13", "normalized": true, "object": "reg_object", "object.fullpath": "\\registry\\machine\\software\\wow6432node\\microsoft\\windows\\currentversion\\runonce\\calcimplant", "object.name": "calcimplant", "object.new_value": "c:\\windows\\system32\\calc.exe", "object.path": "\\registry\\machine\\software\\wow6432node\\microsoft\\windows\\currentversion\\runonce\\", "object.property": "value", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-12T19:17:17.180Z", "status": "success", "subject.account.domain": "stand2008", "subject.account.id": "synthetic:администратор@stand2008", "subject.account.name": "администратор", "subject.process.fullpath": "c:\\windows\\system32\\reg.exe", "subject.process.guid": "2b856446-645b-6487-ba09-00000000c100", "subject.process.id": "2460", "subject.process.name": "reg.exe", "subject.process.path": "c:\\windows\\system32\\", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2023-06-12T18:30:51.264Z", "type": "raw", "uuid": "b4349995-7d1f-4292-9177-fe3ed9b7436d"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 {"action": "modify", "category.generic": "Attack", "category.high": "Persistence", "category.low": "Boot or Logon Autostart Execution: Registry Run Keys / Startup Folder", "correlation_name": "Create_persist_via_Hidden_Run_key_value", "correlation_type": "incident", "event_src.category": "Other", "event_src.fqdn": "msedgewin10", "event_src.host": "msedgewin10", "event_src.hostname": "msedgewin10", "event_src.rule": "Persistence - Hidden Run value detected", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "importance": "medium", "incident.aggregation.key": "Create_persist_via_Hidden_Run_key_value|msedgewin10|a.exe", "incident.aggregation.timeout": 7200, "incident.category": "Undefined", "incident.severity": "medium", "object": "reg_object", "object.fullpath": "\\registry\\machine\\software\\microsoft\\windows\\currentversion\\run\\", "object.new_value": "\"c:\\windows\\tasks\\taskhost.exe\"", "object.path": "\\registry\\machine\\software\\microsoft\\windows\\currentversion\\run\\", "object.property": "value", "status": "success", "subject": "process", "subject.process.fullpath": "c:\\users\\public\\tools\\evasion\\a.exe", "subject.process.guid": "747f3d96-8fd2-5f00-0000-0010c15d2200", "subject.process.id": "3728", "subject.process.name": "a.exe", "subject.process.path": "c:\\users\\public\\tools\\evasion\\"}
