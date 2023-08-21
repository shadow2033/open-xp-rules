{"action": "modify", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"13\",\"Version\":\"2\",\"Level\":\"4\",\"Task\":\"13\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2019-03-17T20:22:59.3997616Z\"},\"EventRecordID\":\"5329\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"1852\",\"ThreadID\":\"464\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"PC04.example.corp\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"Name\":\"RuleName\"},{\"Name\":\"EventType\",\"text\":\"SetValue\"},{\"Name\":\"UtcTime\",\"text\":\"2019-03-17 20:22:59.399\"},{\"Name\":\"ProcessGuid\",\"text\":\"{365abb72-ac79-5c8e-0000-0010e1b50d00}\"},{\"Name\":\"ProcessId\",\"text\":\"2872\"},{\"Name\":\"Image\",\"text\":\"C:\\\\Windows\\\\regedit.exe\"},{\"Name\":\"TargetObject\",\"text\":\"HKLM\\\\System\\\\CurrentControlSet\\\\Control\\\\Terminal Server\\\\WinStations\\\\RDP-Tcp\\\\PortNumber\"},{\"Name\":\"Details\",\"text\":\"DWORD (0x00000050)\"}]}}}", "category.generic": "Registry Object", "category.high": "System Management", "category.low": "Manipulation", "event_src.category": "Other", "event_src.fqdn": "pc04.example.corp", "event_src.host": "pc04.example.corp", "event_src.hostname": "pc04", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Sysmon_13_Registry_value_changed", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "13", "normalized": true, "object": "reg_object", "object.fullpath": "\\registry\\machine\\system\\currentcontrolset\\control\\terminal server\\winstations\\rdp-tcp\\portnumber", "object.name": "portnumber", "object.new_value": "dword (0x00000050)", "object.path": "\\registry\\machine\\system\\currentcontrolset\\control\\terminal server\\winstations\\rdp-tcp\\", "object.property": "value", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-09T13:53:16.262Z", "status": "success", "subject.process.fullpath": "c:\\windows\\regedit.exe", "subject.process.guid": "365abb72-ac79-5c8e-0000-0010e1b50d00", "subject.process.id": "2872", "subject.process.name": "regedit.exe", "subject.process.path": "c:\\windows\\", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2019-03-17T20:22:59.399Z", "type": "raw", "uuid": "b011e315-09fa-46b6-a030-b6deebb3a715"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 								{"action": "modify", "category.generic": "Attack", "category.high": "Defense Evasion", "category.low": "Modify Registry", "correlation_name": "RDP_settings_tampering", "correlation_type": "incident", "event_src.category": "Other", "event_src.fqdn": "pc04.example.corp", "event_src.host": "pc04.example.corp", "event_src.hostname": "pc04", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "importance": "medium", "incident.aggregation.key": "RDP_settings_tampering|pc04.example.corp|regedit.exe", "incident.aggregation.timeout": 7200, "incident.category": "Undefined", "incident.severity": "medium", "object": "reg_object", "object.fullpath": "\\registry\\machine\\system\\currentcontrolset\\control\\terminal server\\winstations\\rdp-tcp\\portnumber", "object.name": "portnumber", "object.new_value": "dword (0x00000050)", "object.path": "\\registry\\machine\\system\\currentcontrolset\\control\\terminal server\\winstations\\rdp-tcp\\", "object.property": "value", "status": "success", "subject": "process", "subject.process.fullpath": "c:\\windows\\regedit.exe", "subject.process.guid": "365abb72-ac79-5c8e-0000-0010e1b50d00", "subject.process.id": "2872", "subject.process.name": "regedit.exe", "subject.process.path": "c:\\windows\\"}